package com.mifko;

import com.mifko.documents.Document;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OrderRequest
{
	Document document;
	Integer priority;

	public OrderRequest(Document doc, Integer priority)
	{
		this.document=doc;
		this.priority=priority;
	}
	
	public static List<OrderRequest> merge(List<OrderRequest> d1, List<OrderRequest> d2) {
		Map<String, List<OrderRequest>> resultMap= Stream.of(d1, d2).flatMap(List::stream)
				.filter(m->m.getDocument()!=null)
				.filter(m->m.getPriority()>0)
				.sorted(Comparator.comparingLong(OrderRequest::getPriority))
				.collect(Collectors.groupingBy(o -> o.getDocument().getDocumentMetaData().getFileName(),LinkedHashMap::new,
						Collectors.toList()));
		List<OrderRequest> resultList = new ArrayList<>();
		resultMap.forEach((s, printDocuments) -> resultList.addAll(printDocuments));
		return resultList;
	}

	public void print(){
		System.out.print("{"+this.document.getDocumentMetaData().getFileName()+","+ this.priority+"}");
	}

	public Document getDocument()
	{
		return document;
	}

	public long getPriority()
	{
		return priority;
	}

}
