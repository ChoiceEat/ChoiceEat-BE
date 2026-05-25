package com.choiceeat.backend.domain.recommendation.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RecommendationType {

    BALANCE("밸런스", "가격과 퀄리티의 균형이 가장 좋은 곳입니다."),
    VALUE("가성비", "가격 대비 만족도가 가장 높은 곳입니다."),
    QUALITY("퀄리티", "평점과 리뷰가 가장 우수한 곳입니다.");

    private final String displayName;
    private final String description;
}
