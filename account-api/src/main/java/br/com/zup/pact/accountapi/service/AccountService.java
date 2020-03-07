package br.com.zup.pact.accountapi.service;

import br.com.zup.pact.accountapi.dto.AccountDetailsDTO;

import java.util.Optional;

public interface AccountService {
    Optional<AccountDetailsDTO> getAccountDetailsByClientId(Integer clientId);
}
