package com.sist.web.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.web.service.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
public class ReplyRestController {
  private final ReplyService rService;
  
  @GetMapping("/reply/list_vue/")
  public ResponseEntity<Map> reply_list_vue(
	@RequestParam("cno") int cno,
	@RequestParam("type") int type
  )
  {
	  Map map=new HashMap();
	  try
	  {
		  List<ReplyVO> list=rService.replyListData(cno, type);
		  map.put("rList", list);
		  map.put("cno", cno);
		  map.put("type", type);
	  }catch(Exception ex)
	  {
		  return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  return new ResponseEntity<>(map,HttpStatus.OK);
  }
  
}
