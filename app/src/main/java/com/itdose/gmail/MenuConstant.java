package com.itdose.gmail;

import java.util.ArrayList;
import java.util.List;

public class MenuConstant {

    public static List<DrawerMenu> getMenuList(){
        List<DrawerMenu> list = new ArrayList<>();
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"","Primary",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"","Social",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"","Promotions",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"","Updates",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"Recent Labels","LinkedIn",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Starred",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Snoozed",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Important",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Sent",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Scheduled",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Outbox",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Drafts",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","All mail",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Spam",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","Trash",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","[Imap]/Trash",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"All Labels","LinkedIn",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"Google Apps","Calendar",28,false));
        list.add(new DrawerMenu(R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,"Google Apps","Contacts",28,false));
    return list;
    }
}
