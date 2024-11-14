package com.msa.rental.application.inputport;

import com.msa.rental.application.outputport.RentalCardOutputPort;
import com.msa.rental.application.usecase.RentItemUsecase;
import com.msa.rental.domain.model.RentalCard;
import com.msa.rental.domain.model.vo.IdName;
import com.msa.rental.domain.model.vo.Item;
import com.msa.rental.framwork.web.dto.RentalCardOutputDTO;
import com.msa.rental.framwork.web.dto.UserItemInputDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RentItemInputPort implements RentItemUsecase {

    private final RentalCardOutputPort rentalCardOutputPort;

    @Override
    public RentalCardOutputDTO rentItem(UserItemInputDTO rental) throws Exception {
        RentalCard rentalCard =rentalCardOutputPort.loadRentalCard(rental.userId)
                .orElseGet(()-> RentalCard.createRentalCard(new
                IdName(rental.getUserId(), rental.getUserNm())));

        // 대여할 아이템 생성 및 대여 처리
        Item newItem = new Item(rental.getItemId(), rental.getItemTitle());
        rentalCard.rentItem(newItem);
        return RentalCardOutputDTO.mapToDTO(rentalCard);

    }
}
