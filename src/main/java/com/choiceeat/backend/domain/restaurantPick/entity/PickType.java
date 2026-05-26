package com.choiceeat.backend.domain.restaurantPick.entity;

public enum PickType {
    VALUE("가성비 픽"),
    BALANCE("밸런스 픽"),
    QUALITY("퀄리티 픽");

    private final String displayName;

    PickType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
