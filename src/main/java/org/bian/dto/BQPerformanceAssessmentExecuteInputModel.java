package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentExecuteInputModel
 */
public class BQPerformanceAssessmentExecuteInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String performanceAssessmentInstanceReference = null;

  private BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private Object performanceAssessmentExecuteActionTaskRecord = null;

  private BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Portfolio Management Plan instance 
   * @return customerCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReference() {
    return customerCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReference(String customerCampaignPortfolioManagementPlanInstanceReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReference = customerCampaignPortfolioManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Assessment instance 
   * @return performanceAssessmentInstanceReference
  **/

  public String getPerformanceAssessmentInstanceReference() {
    return performanceAssessmentInstanceReference;
  }

  public void setPerformanceAssessmentInstanceReference(String performanceAssessmentInstanceReference) {
    this.performanceAssessmentInstanceReference = performanceAssessmentInstanceReference;
  }


  /**
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQMarketTrackingExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

