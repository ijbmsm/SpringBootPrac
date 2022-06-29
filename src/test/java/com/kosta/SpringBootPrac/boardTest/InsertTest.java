package com.kosta.SpringBootPrac.boardTest;

import com.kosta.SpringBootPrac.repository.UserRepository;
import com.kosta.SpringBootPrac.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;
import java.util.stream.IntStream;

@SpringBootTest
public class InsertTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void insertFunction(){
        String[] arr = {"승민", "동숙", "철수", "영희"};
        IntStream.rangeClosed(1, 10).forEach(i->{
            int num = new Random().nextInt(arr.length);
            UserVO userVO = UserVO.builder()
                    .name(arr[num])
                    .ssg(i)
                    .build();
            userRepository.save(userVO);
        });
    }

}
