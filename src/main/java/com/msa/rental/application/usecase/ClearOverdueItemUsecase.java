package com.msa.rental.application.usecase;

import com.msa.rental.framwork.web.dto.ClearOverdueInfoDTO;
import com.msa.rental.framwork.web.dto.RentalResultOutputDTO;

public interface ClearOverdueItemUsecase {
    RentalResultOutputDTO clearOverdue(ClearOverdueInfoDTO clearOverdueInfoDTO)
            throws Exception;
}