package com.ironhack.opponentselectionservice.service;

import com.ironhack.opponentselectionservice.dto.CharacterDTO;

import java.util.List;

public interface OpponentSelectionService {

    List<CharacterDTO> getOpponentCharacters(int partyLevel);

    // -------------------- Aux Methods --------------------
    boolean isValidOpponentList(List<String> opponentList);

    List<CharacterDTO> selectFighters(List<CharacterDTO> party, int nrOfFighters);

    // -------------------- Proxy Calls --------------------
    List<String> getPossibleOpponentNames(int min, int max);

    List<CharacterDTO> getParty(String userUsername);

}
