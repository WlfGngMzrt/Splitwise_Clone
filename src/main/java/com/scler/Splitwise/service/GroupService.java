package com.scler.Splitwise.service;

import com.scler.Splitwise.dto.TransactionDTO;

import java.util.List;

public interface GroupService {
    List<TransactionDTO> settleUp();
}
