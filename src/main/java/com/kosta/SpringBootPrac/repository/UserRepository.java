package com.kosta.SpringBootPrac.repository;

import com.kosta.SpringBootPrac.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, Long> {

}
