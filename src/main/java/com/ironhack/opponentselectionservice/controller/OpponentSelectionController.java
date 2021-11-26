package com.ironhack.opponentselectionservice.controller;

import com.ironhack.opponentselectionservice.dto.CharacterDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OpponentSelectionController {

    ResponseEntity<List<CharacterDTO>> getOpponents(Integer partyLevel);

}
