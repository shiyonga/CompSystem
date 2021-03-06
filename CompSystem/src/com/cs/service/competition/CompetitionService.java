package com.cs.service.competition;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cs.pojo.Competition;
import com.cs.util.PageInfo;

@Service
public interface CompetitionService {
	PageInfo CompetitionList(Map map);

	  List<Competition> beforeToday();
	    List<Competition> afterToday();
	List<Map> analysisComp(Map map);
	
	List<Map> unPubCom(String department);
}
