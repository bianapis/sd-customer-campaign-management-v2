package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentExecuteOutputModel
 */
public class BQPerformanceAssessmentExecuteOutputModel   {
  private BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private String performanceAssessmentExecuteActionTaskReference = null;

  private Object performanceAssessmentExecuteActionTaskRecord = null;

  private String performanceAssessmentExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Assessment instance execute service call 
   * @return performanceAssessmentExecuteActionTaskReference
  **/

  public String getPerformanceAssessmentExecuteActionTaskReference() {
    return performanceAssessmentExecuteActionTaskReference;
  }

  public void setPerformanceAssessmentExecuteActionTaskReference(String performanceAssessmentExecuteActionTaskReference) {
    this.performanceAssessmentExecuteActionTaskReference = performanceAssessmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return performanceAssessmentExecuteActionTaskRecord
  **/

  public Object getPerformanceAssessmentExecuteActionTaskRecord() {
    return performanceAssessmentExecuteActionTaskRecord;
  }

  public void setPerformanceAssessmentExecuteActionTaskRecord(Object performanceAssessmentExecuteActionTaskRecord) {
    this.performanceAssessmentExecuteActionTaskRecord = performanceAssessmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Assessment execute transaction/record 
   * @return performanceAssessmentExecuteRecordReference
  **/

  public String getPerformanceAssessmentExecuteRecordReference() {
    return performanceAssessmentExecuteRecordReference;
  }

  public void setPerformanceAssessmentExecuteRecordReference(String performanceAssessmentExecuteRecordReference) {
    this.performanceAssessmentExecuteRecordReference = performanceAssessmentExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

