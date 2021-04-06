package org.zerock.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {

	private final String MODULE = "board";
	
	private final String MODULE_NAME = "게시판";
	
	// 실행할 method
	// Mapping : get방식, list.do
	@GetMapping("/list.do")
	public String list() {

		log.info("list() : " + MODULE_NAME + " list 입니다.------------------------------------ ");
		
		return MODULE + "/list";
		
	}
	
	@GetMapping("/view.do")
	public String view() {
		
		log.info("view( : " + MODULE_NAME + " 글 보기 입니다.");
		
		return MODULE + "/view";
		
	}
	
	@GetMapping("/write.do")
	public String writeForm() {
		
		log.info("writeForm() : " + MODULE_NAME + " 글 쓰기 폼 입니다.------------------------------------ ");
		
		return MODULE + "/write";
		
	}
	
	@PostMapping("/write.do")
	public String write() {
		
		log.info("write() : " + MODULE_NAME + " 글 등록 처리입니다.------------------------------------ ");
		
		return "redirect:list.do";
		
	}
	
	@GetMapping("/update.do")
	public String updateForm() {
		
		log.info("updateForm() : " + MODULE_NAME + "글 수정 폼 입니다.------------------------------------------");
		
		return MODULE + "/update";
		
	}
	
	@PostMapping("/update.do")
	public String update() {
		
		log.info("update() : " + MODULE_NAME + " 글 수정 처리 입니다. -----------------------------------");
		
		return "redirect:view.do";
		
	}
	
	@GetMapping("/delete.do")
	public String delete() {
		
		log.info("delete() : " + MODULE_NAME + " 글 삭제 처리 입니다.----------------------------------------");
		
		return "redirect:list.do";
		
	}
	
}
