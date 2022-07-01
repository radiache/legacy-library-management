package com.me.librarymanagementsystem.service;

import java.util.List;

import com.me.librarymanagementsystem.entity.Publisher;

public interface PublisherService {

	public List<Publisher> findAllPublishers();

	public Publisher findPublisherById(Long id);

	public void createPublisher(Publisher publisher);

	public void updatePublisher(Publisher publisher);

	public void deletePublisher(Long id);

}
