package com.semicolon.ddyzd_android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.semicolon.ddyzd_android.databinding.ActivityAddFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.ActivityChatListBindingImpl;
import com.semicolon.ddyzd_android.databinding.ActivityChattingPageBindingImpl;
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBindingImpl;
import com.semicolon.ddyzd_android.databinding.ActivityLoginBindingImpl;
import com.semicolon.ddyzd_android.databinding.ActivityMainBindingImpl;
import com.semicolon.ddyzd_android.databinding.FeedNoSheetBindingImpl;
import com.semicolon.ddyzd_android.databinding.FeedSheetBindingImpl;
import com.semicolon.ddyzd_android.databinding.FragmentClublistBindingImpl;
import com.semicolon.ddyzd_android.databinding.FragmentFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.FragmentMypageBindingImpl;
import com.semicolon.ddyzd_android.databinding.FragmentUserInfoBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubApplicationChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemClubResultChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemFeedHeaderBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemInclubUserClubBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemMemberListBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemMemberProfileBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemMyChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemPageImageBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemScheduleChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemUserApplicationChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemUserClubBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemUserResultChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ItemYourChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.ListChatBindingImpl;
import com.semicolon.ddyzd_android.databinding.SheetChoiceModifyBindingImpl;
import com.semicolon.ddyzd_android.databinding.SheetClubFeedBindingImpl;
import com.semicolon.ddyzd_android.databinding.SheetGitEditBindingImpl;
import com.semicolon.ddyzd_android.databinding.SheetModifyIntroBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDFEED = 1;

  private static final int LAYOUT_ACTIVITYCHATLIST = 2;

  private static final int LAYOUT_ACTIVITYCHATTINGPAGE = 3;

  private static final int LAYOUT_ACTIVITYCLUBDETAILS = 4;

  private static final int LAYOUT_ACTIVITYLOGIN = 5;

  private static final int LAYOUT_ACTIVITYMAIN = 6;

  private static final int LAYOUT_FEEDNOSHEET = 7;

  private static final int LAYOUT_FEEDSHEET = 8;

  private static final int LAYOUT_FRAGMENTCLUBLIST = 9;

  private static final int LAYOUT_FRAGMENTFEED = 10;

  private static final int LAYOUT_FRAGMENTMYPAGE = 11;

  private static final int LAYOUT_FRAGMENTUSERINFO = 12;

  private static final int LAYOUT_ITEMCLUB = 13;

  private static final int LAYOUT_ITEMCLUBAPPLICATIONCHAT = 14;

  private static final int LAYOUT_ITEMCLUBDETAILHEADER = 15;

  private static final int LAYOUT_ITEMCLUBFEED = 16;

  private static final int LAYOUT_ITEMCLUBIMAGEFEED = 17;

  private static final int LAYOUT_ITEMCLUBRESULTCHAT = 18;

  private static final int LAYOUT_ITEMFEED = 19;

  private static final int LAYOUT_ITEMFEEDHEADER = 20;

  private static final int LAYOUT_ITEMIMAGEFEED = 21;

  private static final int LAYOUT_ITEMINCLUBUSERCLUB = 22;

  private static final int LAYOUT_ITEMMEMBERLIST = 23;

  private static final int LAYOUT_ITEMMEMBERPROFILE = 24;

  private static final int LAYOUT_ITEMMYCHAT = 25;

  private static final int LAYOUT_ITEMPAGEIMAGE = 26;

  private static final int LAYOUT_ITEMSCHEDULECHAT = 27;

  private static final int LAYOUT_ITEMUSERAPPLICATIONCHAT = 28;

  private static final int LAYOUT_ITEMUSERCLUB = 29;

  private static final int LAYOUT_ITEMUSERRESULTCHAT = 30;

  private static final int LAYOUT_ITEMYOURCHAT = 31;

  private static final int LAYOUT_LISTCHAT = 32;

  private static final int LAYOUT_SHEETCHOICEMODIFY = 33;

  private static final int LAYOUT_SHEETCLUBFEED = 34;

  private static final int LAYOUT_SHEETGITEDIT = 35;

  private static final int LAYOUT_SHEETMODIFYINTRO = 36;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(36);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_add_feed, LAYOUT_ACTIVITYADDFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_chat_list, LAYOUT_ACTIVITYCHATLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_chatting_page, LAYOUT_ACTIVITYCHATTINGPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_club_details, LAYOUT_ACTIVITYCLUBDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.feed_no_sheet, LAYOUT_FEEDNOSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.feed_sheet, LAYOUT_FEEDSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.fragment_clublist, LAYOUT_FRAGMENTCLUBLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.fragment_feed, LAYOUT_FRAGMENTFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.fragment_mypage, LAYOUT_FRAGMENTMYPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.fragment_user_info, LAYOUT_FRAGMENTUSERINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club, LAYOUT_ITEMCLUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club_application_chat, LAYOUT_ITEMCLUBAPPLICATIONCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club_detail_header, LAYOUT_ITEMCLUBDETAILHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club_feed, LAYOUT_ITEMCLUBFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club_image_feed, LAYOUT_ITEMCLUBIMAGEFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_club_result_chat, LAYOUT_ITEMCLUBRESULTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_feed, LAYOUT_ITEMFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_feed_header, LAYOUT_ITEMFEEDHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_image_feed, LAYOUT_ITEMIMAGEFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_inclub_user_club, LAYOUT_ITEMINCLUBUSERCLUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_member_list, LAYOUT_ITEMMEMBERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_member_profile, LAYOUT_ITEMMEMBERPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_my_chat, LAYOUT_ITEMMYCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_page_image, LAYOUT_ITEMPAGEIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_schedule_chat, LAYOUT_ITEMSCHEDULECHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_user_application_chat, LAYOUT_ITEMUSERAPPLICATIONCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_user_club, LAYOUT_ITEMUSERCLUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_user_result_chat, LAYOUT_ITEMUSERRESULTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.item_your_chat, LAYOUT_ITEMYOURCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.list_chat, LAYOUT_LISTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.sheet_choice_modify, LAYOUT_SHEETCHOICEMODIFY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.sheet_club_feed, LAYOUT_SHEETCLUBFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.sheet_git_edit, LAYOUT_SHEETGITEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.semicolon.ddyzd_android.R.layout.sheet_modify_intro, LAYOUT_SHEETMODIFYINTRO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDFEED: {
          if ("layout/activity_add_feed_0".equals(tag)) {
            return new ActivityAddFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHATLIST: {
          if ("layout/activity_chat_list_0".equals(tag)) {
            return new ActivityChatListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chat_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHATTINGPAGE: {
          if ("layout/activity_chatting_page_0".equals(tag)) {
            return new ActivityChattingPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chatting_page is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCLUBDETAILS: {
          if ("layout/activity_club_details_0".equals(tag)) {
            return new ActivityClubDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_club_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDNOSHEET: {
          if ("layout/feed_no_sheet_0".equals(tag)) {
            return new FeedNoSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feed_no_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FEEDSHEET: {
          if ("layout/feed_sheet_0".equals(tag)) {
            return new FeedSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for feed_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCLUBLIST: {
          if ("layout/fragment_clublist_0".equals(tag)) {
            return new FragmentClublistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_clublist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEED: {
          if ("layout/fragment_feed_0".equals(tag)) {
            return new FragmentFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYPAGE: {
          if ("layout/fragment_mypage_0".equals(tag)) {
            return new FragmentMypageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_mypage is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERINFO: {
          if ("layout/fragment_user_info_0".equals(tag)) {
            return new FragmentUserInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_info is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUB: {
          if ("layout/item_club_0".equals(tag)) {
            return new ItemClubBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUBAPPLICATIONCHAT: {
          if ("layout/item_club_application_chat_0".equals(tag)) {
            return new ItemClubApplicationChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club_application_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUBDETAILHEADER: {
          if ("layout/item_club_detail_header_0".equals(tag)) {
            return new ItemClubDetailHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club_detail_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUBFEED: {
          if ("layout/item_club_feed_0".equals(tag)) {
            return new ItemClubFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUBIMAGEFEED: {
          if ("layout/item_club_image_feed_0".equals(tag)) {
            return new ItemClubImageFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club_image_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCLUBRESULTCHAT: {
          if ("layout/item_club_result_chat_0".equals(tag)) {
            return new ItemClubResultChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_club_result_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEED: {
          if ("layout/item_feed_0".equals(tag)) {
            return new ItemFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDHEADER: {
          if ("layout/item_feed_header_0".equals(tag)) {
            return new ItemFeedHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMIMAGEFEED: {
          if ("layout/item_image_feed_0".equals(tag)) {
            return new ItemImageFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_image_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINCLUBUSERCLUB: {
          if ("layout/item_inclub_user_club_0".equals(tag)) {
            return new ItemInclubUserClubBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_inclub_user_club is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMEMBERLIST: {
          if ("layout/item_member_list_0".equals(tag)) {
            return new ItemMemberListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_member_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMEMBERPROFILE: {
          if ("layout/item_member_profile_0".equals(tag)) {
            return new ItemMemberProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_member_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYCHAT: {
          if ("layout/item_my_chat_0".equals(tag)) {
            return new ItemMyChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPAGEIMAGE: {
          if ("layout/item_page_image_0".equals(tag)) {
            return new ItemPageImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_page_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSCHEDULECHAT: {
          if ("layout/item_schedule_chat_0".equals(tag)) {
            return new ItemScheduleChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_schedule_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSERAPPLICATIONCHAT: {
          if ("layout/item_user_application_chat_0".equals(tag)) {
            return new ItemUserApplicationChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user_application_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSERCLUB: {
          if ("layout/item_user_club_0".equals(tag)) {
            return new ItemUserClubBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user_club is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSERRESULTCHAT: {
          if ("layout/item_user_result_chat_0".equals(tag)) {
            return new ItemUserResultChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user_result_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMYOURCHAT: {
          if ("layout/item_your_chat_0".equals(tag)) {
            return new ItemYourChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_your_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTCHAT: {
          if ("layout/list_chat_0".equals(tag)) {
            return new ListChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_SHEETCHOICEMODIFY: {
          if ("layout/sheet_choice_modify_0".equals(tag)) {
            return new SheetChoiceModifyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sheet_choice_modify is invalid. Received: " + tag);
        }
        case  LAYOUT_SHEETCLUBFEED: {
          if ("layout/sheet_club_feed_0".equals(tag)) {
            return new SheetClubFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sheet_club_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_SHEETGITEDIT: {
          if ("layout/sheet_git_edit_0".equals(tag)) {
            return new SheetGitEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sheet_git_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_SHEETMODIFYINTRO: {
          if ("layout/sheet_modify_intro_0".equals(tag)) {
            return new SheetModifyIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sheet_modify_intro is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "club");
      sKeys.put(2, "id");
      sKeys.put(3, "image");
      sKeys.put(4, "navi");
      sKeys.put(5, "position");
      sKeys.put(6, "positon");
      sKeys.put(7, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(36);

    static {
      sKeys.put("layout/activity_add_feed_0", com.semicolon.ddyzd_android.R.layout.activity_add_feed);
      sKeys.put("layout/activity_chat_list_0", com.semicolon.ddyzd_android.R.layout.activity_chat_list);
      sKeys.put("layout/activity_chatting_page_0", com.semicolon.ddyzd_android.R.layout.activity_chatting_page);
      sKeys.put("layout/activity_club_details_0", com.semicolon.ddyzd_android.R.layout.activity_club_details);
      sKeys.put("layout/activity_login_0", com.semicolon.ddyzd_android.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.semicolon.ddyzd_android.R.layout.activity_main);
      sKeys.put("layout/feed_no_sheet_0", com.semicolon.ddyzd_android.R.layout.feed_no_sheet);
      sKeys.put("layout/feed_sheet_0", com.semicolon.ddyzd_android.R.layout.feed_sheet);
      sKeys.put("layout/fragment_clublist_0", com.semicolon.ddyzd_android.R.layout.fragment_clublist);
      sKeys.put("layout/fragment_feed_0", com.semicolon.ddyzd_android.R.layout.fragment_feed);
      sKeys.put("layout/fragment_mypage_0", com.semicolon.ddyzd_android.R.layout.fragment_mypage);
      sKeys.put("layout/fragment_user_info_0", com.semicolon.ddyzd_android.R.layout.fragment_user_info);
      sKeys.put("layout/item_club_0", com.semicolon.ddyzd_android.R.layout.item_club);
      sKeys.put("layout/item_club_application_chat_0", com.semicolon.ddyzd_android.R.layout.item_club_application_chat);
      sKeys.put("layout/item_club_detail_header_0", com.semicolon.ddyzd_android.R.layout.item_club_detail_header);
      sKeys.put("layout/item_club_feed_0", com.semicolon.ddyzd_android.R.layout.item_club_feed);
      sKeys.put("layout/item_club_image_feed_0", com.semicolon.ddyzd_android.R.layout.item_club_image_feed);
      sKeys.put("layout/item_club_result_chat_0", com.semicolon.ddyzd_android.R.layout.item_club_result_chat);
      sKeys.put("layout/item_feed_0", com.semicolon.ddyzd_android.R.layout.item_feed);
      sKeys.put("layout/item_feed_header_0", com.semicolon.ddyzd_android.R.layout.item_feed_header);
      sKeys.put("layout/item_image_feed_0", com.semicolon.ddyzd_android.R.layout.item_image_feed);
      sKeys.put("layout/item_inclub_user_club_0", com.semicolon.ddyzd_android.R.layout.item_inclub_user_club);
      sKeys.put("layout/item_member_list_0", com.semicolon.ddyzd_android.R.layout.item_member_list);
      sKeys.put("layout/item_member_profile_0", com.semicolon.ddyzd_android.R.layout.item_member_profile);
      sKeys.put("layout/item_my_chat_0", com.semicolon.ddyzd_android.R.layout.item_my_chat);
      sKeys.put("layout/item_page_image_0", com.semicolon.ddyzd_android.R.layout.item_page_image);
      sKeys.put("layout/item_schedule_chat_0", com.semicolon.ddyzd_android.R.layout.item_schedule_chat);
      sKeys.put("layout/item_user_application_chat_0", com.semicolon.ddyzd_android.R.layout.item_user_application_chat);
      sKeys.put("layout/item_user_club_0", com.semicolon.ddyzd_android.R.layout.item_user_club);
      sKeys.put("layout/item_user_result_chat_0", com.semicolon.ddyzd_android.R.layout.item_user_result_chat);
      sKeys.put("layout/item_your_chat_0", com.semicolon.ddyzd_android.R.layout.item_your_chat);
      sKeys.put("layout/list_chat_0", com.semicolon.ddyzd_android.R.layout.list_chat);
      sKeys.put("layout/sheet_choice_modify_0", com.semicolon.ddyzd_android.R.layout.sheet_choice_modify);
      sKeys.put("layout/sheet_club_feed_0", com.semicolon.ddyzd_android.R.layout.sheet_club_feed);
      sKeys.put("layout/sheet_git_edit_0", com.semicolon.ddyzd_android.R.layout.sheet_git_edit);
      sKeys.put("layout/sheet_modify_intro_0", com.semicolon.ddyzd_android.R.layout.sheet_modify_intro);
    }
  }
}
