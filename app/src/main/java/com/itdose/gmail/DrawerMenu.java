package com.itdose.gmail;

public class DrawerMenu {
    private int backGroundDrawable;
    private int icon;
    private String heading;
    private String name;
    private int count;
    private boolean isSelected;

    public DrawerMenu(int backGroundDrawable, int icon, String heading, String name, int count, boolean isSelected) {
        this.backGroundDrawable = backGroundDrawable;
        this.icon = icon;
        this.heading = heading;
        this.name = name;
        this.count = count;
        this.isSelected = isSelected;
    }

    public int getBackGroundDrawable() {
        return backGroundDrawable;
    }

    public int getIcon() {
        return icon;
    }

    public String getHeading() {
        return heading;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
