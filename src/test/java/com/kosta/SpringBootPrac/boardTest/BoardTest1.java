package com.kosta.SpringBootPrac.boardTest;

import com.kosta.SpringBootPrac.repository.BoardRepository;
import com.kosta.SpringBootPrac.repository.UserRepository;
import com.kosta.SpringBootPrac.vo.BoardVO;
import com.kosta.SpringBootPrac.vo.UserVO;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardTest1 {

    @Autowired
    BoardRepository boardRepo;

    @Autowired
    UserRepository userRepository;

    @Test
    public void test2() {
        List<BoardVO> boardlist = (List<BoardVO>) boardRepo.findAll();
        boardlist.forEach(board -> {
            System.out.println(board);
        });
    }

    @Test
    public void test1() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            BoardVO board = BoardVO.builder()
                    .content("hi"+i)
                    .title("hi")
                    .writer("유승민"+i)
                    .build();

            boardRepo.save(board); // insert
        });
    }

    @Test
    public void test3() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            UserVO userVO = UserVO.builder()
                    .name("유승민"+i)
                    .ssg(i)
                    .build();

            userRepository.save(userVO); // insert
        });
    }

    @Test
    public void test5(){

        BoardVO board = BoardVO.builder()
                .bno(1L)
                .content("hi")
                .title("유승민입니다")
                .writer("유승민")
                .build();
        boardRepo.save(board);
    }
}
