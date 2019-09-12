package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis;
import org.bian.dto.BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveInputModel
 */
public class BQPerformanceAssessmentRetrieveInputModel   {
  private Object performanceAssessmentRetrieveActionTaskRecord = null;

  private String performanceAssessmentRetrieveActionRequest = null;

  private BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport performanceAssessmentInstanceReport = null;

  private BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis performanceAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return performanceAssessmentRetrieveActionTaskRecord
  **/

  public Object getPerformanceAssessmentRetrieveActionTaskRecord() {
    return performanceAssessmentRetrieveActionTaskRecord;
  }

  public void setPerformanceAssessmentRetrieveActionTaskRecord(Object performanceAssessmentRetrieveActionTaskRecord) {
    this.performanceAssessmentRetrieveActionTaskRecord = performanceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return performanceAssessmentRetrieveActionRequest
  **/

  public String getPerformanceAssessmentRetrieveActionRequest() {
    return performanceAssessmentRetrieveActionRequest;
  }

  public void setPerformanceAssessmentRetrieveActionRequest(String performanceAssessmentRetrieveActionRequest) {
    this.performanceAssessmentRetrieveActionRequest = performanceAssessmentRetrieveActionRequest;
  }


  /**
   * Get performanceAssessmentInstanceReport
   * @return performanceAssessmentInstanceReport
  **/

  public BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport getPerformanceAssessmentInstanceReport() {
    return performanceAssessmentInstanceReport;
  }

  public void setPerformanceAssessmentInstanceReport(BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport performanceAssessmentInstanceReport) {
    this.performanceAssessmentInstanceReport = performanceAssessmentInstanceReport;
  }


  /**
   * Get performanceAssessmentInstanceAnalysis
   * @return performanceAssessmentInstanceAnalysis
  **/

  public BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis getPerformanceAssessmentInstanceAnalysis() {
    return performanceAssessmentInstanceAnalysis;
  }

  public void setPerformanceAssessmentInstanceAnalysis(BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis performanceAssessmentInstanceAnalysis) {
    this.performanceAssessmentInstanceAnalysis = performanceAssessmentInstanceAnalysis;
  }


}

