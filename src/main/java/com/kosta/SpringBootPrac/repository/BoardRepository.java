package com.kosta.SpringBootPrac.repository;

import com.kosta.SpringBootPrac.vo.BoardVO;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardVO, Long> {

}
