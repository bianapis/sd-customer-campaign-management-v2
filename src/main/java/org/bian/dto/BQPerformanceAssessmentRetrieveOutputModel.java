package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord;
import org.bian.dto.BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis;
import org.bian.dto.BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveOutputModel
 */
public class BQPerformanceAssessmentRetrieveOutputModel   {
  private BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private String performanceAssessmentRetrieveActionTaskReference = null;

  private Object performanceAssessmentRetrieveActionTaskRecord = null;

  private String performanceAssessmentRetrieveActionResponse = null;

  private BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport performanceAssessmentInstanceReport = null;

  private BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis performanceAssessmentInstanceAnalysis = null;


  /**
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Assessment instance retrieve service call 
   * @return performanceAssessmentRetrieveActionTaskReference
  **/

  public String getPerformanceAssessmentRetrieveActionTaskReference() {
    return performanceAssessmentRetrieveActionTaskReference;
  }

  public void setPerformanceAssessmentRetrieveActionTaskReference(String performanceAssessmentRetrieveActionTaskReference) {
    this.performanceAssessmentRetrieveActionTaskReference = performanceAssessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return performanceAssessmentRetrieveActionResponse
  **/

  public String getPerformanceAssessmentRetrieveActionResponse() {
    return performanceAssessmentRetrieveActionResponse;
  }

  public void setPerformanceAssessmentRetrieveActionResponse(String performanceAssessmentRetrieveActionResponse) {
    this.performanceAssessmentRetrieveActionResponse = performanceAssessmentRetrieveActionResponse;
  }


  /**
   * Get performanceAssessmentInstanceReport
   * @return performanceAssessmentInstanceReport
  **/

  public BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport getPerformanceAssessmentInstanceReport() {
    return performanceAssessmentInstanceReport;
  }

  public void setPerformanceAssessmentInstanceReport(BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport performanceAssessmentInstanceReport) {
    this.performanceAssessmentInstanceReport = performanceAssessmentInstanceReport;
  }


  /**
   * Get performanceAssessmentInstanceAnalysis
   * @return performanceAssessmentInstanceAnalysis
  **/

  public BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis getPerformanceAssessmentInstanceAnalysis() {
    return performanceAssessmentInstanceAnalysis;
  }

  public void setPerformanceAssessmentInstanceAnalysis(BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis performanceAssessmentInstanceAnalysis) {
    this.performanceAssessmentInstanceAnalysis = performanceAssessmentInstanceAnalysis;
  }


}

