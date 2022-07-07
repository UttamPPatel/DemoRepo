package com.infy.infyinterns.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.dto.ProjectDTO;
import com.infy.infyinterns.entity.Mentor;
import com.infy.infyinterns.exception.InfyInternException;
import com.infy.infyinterns.repository.MentorRepository;
import com.infy.infyinterns.repository.ProjectRepository;

@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService {

	@Autowired MentorRepository mRepository;
	@Autowired ProjectRepository pRepository;
	
	@Override
	public Integer allocateProject(ProjectDTO project) throws InfyInternException {

		return null;
	}

	
	@Override
	public List<MentorDTO> getMentors(Integer numberOfProjectsMentored) throws InfyInternException {
		List<Mentor> mentors=mRepository.findByNumberOfProjectsMentored(numberOfProjectsMentored);
		List<MentorDTO> mentorDTOs=new ArrayList<MentorDTO>();
		mentors.forEach(mn->{
				MentorDTO m=new MentorDTO();
				m.setMentorId(mn.getMentorId());
				m.setMentorName(mn.getMentorName());
				m.setNumberOfProjectsMentored(mn.getNumberOfProjectsMentored());
				mentorDTOs.add(m);
				
		});
		return mentorDTOs;
	}


	@Override
	public void updateProjectMentor(Integer projectId, Integer mentorId) throws InfyInternException {
		
	}

	@Override
	public void deleteProject(Integer projectId) throws InfyInternException {
		
	}
}