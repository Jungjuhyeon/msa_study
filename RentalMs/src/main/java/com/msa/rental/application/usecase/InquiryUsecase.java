package com.msa.rental.application.usecase;

import com.msa.rental.framwork.web.dto.RentItemOutputDTO;
import com.msa.rental.framwork.web.dto.RentalCardOutputDTO;
import com.msa.rental.framwork.web.dto.ReturnItemOutputDTO;
import com.msa.rental.framwork.web.dto.UserInputDTO;

import java.util.List;
import java.util.Optional;

public interface InquiryUsecase {
    public Optional<RentalCardOutputDTO> getRentalCard(UserInputDTO userInputDTO);
    public Optional<List<RentItemOutputDTO>> getAllRentItem(UserInputDTO userInputDTO);
    public Optional<List<ReturnItemOutputDTO>> getAllReturnItem(UserInputDTO userInputDTO);
}
