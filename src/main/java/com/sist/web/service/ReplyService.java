package com.sist.web.service;

import java.util.List;
import com.sist.web.vo.ReplyVO;

public interface ReplyService {
	/*@Select("SELECT no,cno,type,id,name,msg,TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS') as dbday "
			 +"FROM comment_1 "
			 +"WHERE cno=#{cno} AND type=#{type} "
			 +"ORDER BY no DESC")*/
	  public List<ReplyVO> replyListData(int cno,int type);
	 /*@Insert("INSERT INTO comment_1 VALUES("
				 +"(SELECT NVL(MAX(no)+1,1) FROM comment_1),"
				 +"#{cno},#{type},#{id},#{name},#{msg},SYSDATE)")*/
	  public void replyInsert(ReplyVO vo);
}
