package com.ironhack.opponentselectionservice.controller;

import com.ironhack.opponentselectionservice.dto.CharacterDTO;
import com.ironhack.opponentselectionservice.service.OpponentSelectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/opponent")
@RequiredArgsConstructor
@Slf4j
public class OpponentSelectionControllerImpl implements OpponentSelectionController {
    private final OpponentSelectionService opponentSelectionService;


    @GetMapping("random/{level}")
    public ResponseEntity<List<CharacterDTO>> getOpponents(@PathVariable(name = "level") Integer partyLevel) {
        log.info("Getting opponents for level {}", partyLevel);
        var listOfOpponents = opponentSelectionService.getOpponentCharacters(partyLevel);
        return ResponseEntity.ok(listOfOpponents);
    }

}
