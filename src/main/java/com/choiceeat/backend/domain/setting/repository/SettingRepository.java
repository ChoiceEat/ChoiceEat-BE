package com.choiceeat.backend.domain.setting.repository;

import com.choiceeat.backend.domain.setting.entity.Setting;
import com.choiceeat.backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SettingRepository extends JpaRepository<Setting, Long> {
    // 특정 유저의 설정 정보를 찾을 때 사용.
    Optional<Setting> findByUser(User user);
}