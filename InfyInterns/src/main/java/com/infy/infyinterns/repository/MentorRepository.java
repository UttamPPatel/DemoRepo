package com.infy.infyinterns.repository;

import java.util.List;

import com.infy.infyinterns.entity.Mentor;

public interface MentorRepository
{
   public List<Mentor> findByNumberOfProjectsMentored(int numberOfProjectsMentored);
}
