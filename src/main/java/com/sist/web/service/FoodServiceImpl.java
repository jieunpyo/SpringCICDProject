package com.sist.web.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService{
   private final FoodMapper mapper;

   @Override
   public List<FoodVO> foodListData(int start) {
	// TODO Auto-generated method stub
	return mapper.foodListData(start);
   }

   @Override
   public int foodTotalpage() {
	// TODO Auto-generated method stub
	return mapper.foodTotalpage();
   }

   @Override
   public List<FoodVO> foodFindData(int start, String address) {
	// TODO Auto-generated method stub
	return mapper.foodFindData(start, address);
   }

   @Override
   public int foodFindTotalpage(String address) {
	// TODO Auto-generated method stub
	return mapper.foodFindTotalpage(address);
   }

   @Override
   public FoodVO foodDetailData(int fno) {
	// TODO Auto-generated method stub
	mapper.foodHitIncrement(fno);
	return mapper.foodDetailData(fno);
   }

}
