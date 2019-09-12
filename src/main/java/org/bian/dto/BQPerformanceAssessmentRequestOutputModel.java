package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRequestOutputModel
 */
public class BQPerformanceAssessmentRequestOutputModel   {
  private BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private String performanceAssessmentRequestActionTaskReference = null;

  private Object performanceAssessmentRequestActionTaskRecord = null;

  private String performanceAssessmentRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Assessment instance request service call 
   * @return performanceAssessmentRequestActionTaskReference
  **/

  public String getPerformanceAssessmentRequestActionTaskReference() {
    return performanceAssessmentRequestActionTaskReference;
  }

  public void setPerformanceAssessmentRequestActionTaskReference(String performanceAssessmentRequestActionTaskReference) {
    this.performanceAssessmentRequestActionTaskReference = performanceAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return performanceAssessmentRequestActionTaskRecord
  **/

  public Object getPerformanceAssessmentRequestActionTaskRecord() {
    return performanceAssessmentRequestActionTaskRecord;
  }

  public void setPerformanceAssessmentRequestActionTaskRecord(Object performanceAssessmentRequestActionTaskRecord) {
    this.performanceAssessmentRequestActionTaskRecord = performanceAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Assessment service request record 
   * @return performanceAssessmentRequestRecordReference
  **/

  public String getPerformanceAssessmentRequestRecordReference() {
    return performanceAssessmentRequestRecordReference;
  }

  public void setPerformanceAssessmentRequestRecordReference(String performanceAssessmentRequestRecordReference) {
    this.performanceAssessmentRequestRecordReference = performanceAssessmentRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

