package com.ironhack.opponentselectionservice.service;

import com.ironhack.opponentselectionservice.dto.CharacterDTO;
import com.ironhack.opponentselectionservice.dto.NewCharacterDTO;
import com.ironhack.opponentselectionservice.dto.RegisterUserDTO;
import com.ironhack.opponentselectionservice.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public interface OpponentCreationService {

    // -------------------- Create Opponent --------------------
    List<CharacterDTO> generateOpponent(int opponentLevel);

    // -------------------- Create User Opponent --------------------
    UserDTO createUserOpponent();


    // -------------------- Create Party Opponent --------------------
    List<CharacterDTO> createOpponentParty(String userUsername);

    List<CharacterDTO> levelUpOpponentParty(int level, String userUsername, List<CharacterDTO> party);


    // -------------------- Aux Methods  --------------------
    String generateUsername();

    boolean isValidUserUsername(String username);

    String generateCharacterName();

    ArrayList<String> getRandomPoints(int numberOfPoints);


    // -------------------- Proxy Methods  --------------------
    UserDTO registerUser(RegisterUserDTO registerUserDTO);

    CharacterDTO registerCharacter(NewCharacterDTO newCharacter);

    CharacterDTO levelUpCharacter(CharacterDTO characterToUpdate);

    UserDTO getUserByUsername(String username);

}
