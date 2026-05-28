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

    public static PickType fromString(String text) {
        for (PickType pick : PickType.values()) {
            // "밸런스 픽"에 "밸런스"가 포함되어 있거나, 영어 이름이 같으면 반환
            if (pick.displayName.contains(text) || pick.name().equalsIgnoreCase(text)) {
                return pick;
            }
        }
        throw new IllegalArgumentException("알 수 없는 픽 종류입니다: " + text);
    }
}
