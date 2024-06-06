package com.project.board.service;

import com.project.board.dto.BoardDTO;
import com.project.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
