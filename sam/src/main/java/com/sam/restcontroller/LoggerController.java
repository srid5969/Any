package com.sam.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoggerController {

	Logger logger = LoggerFactory.getLogger(LoggerController.class);

	@GetMapping("/message")
	public String getMessage() {
		logger.info("[getMessage] info message");
		logger.warn("[getMessage] warn message");
		logger.error("[getMessage] error message");
		logger.debug("[getMessage] debug message");
		logger.trace("[getMessage] trace message");
//		System.out.println(10 / 0);
		return "open console to check log messages.";
	}

//	http://localhost:8080/debug
	@GetMapping("/debug")
	public String greeting() {
		logger.debug("debug message from controller");
		return "Debug Logger Controller";
	}

//	http://localhost:8080/info
	@GetMapping("/info")
	public String info() {
		logger.info("info msg from controller");
		return "Info Logger Controller";
	}

//	http://localhost:8080/warn
	@GetMapping("/warn")
	public String warn() {
		logger.warn("waring msg from controller");
		return "Warn Logger Controller";
	}

//	http://localhost:8080/erro
	@GetMapping("/erro")
	public String errorLogger() {
		logger.error("FATAL ERROR");
		return "Error Logger Controller";
	}

//	http://localhost:8080/trace
	@GetMapping("/trace")
	public String traceLoger() throws InterruptedException {
		logger.trace("trace message from controller");
		return "Trace Controller";
	}

//	http://localhost:8080/wait
	@GetMapping("/wait")
	public String waiting() throws InterruptedException {
		logger.wait(67500000);
		return "Wait Controller";
	}

}
