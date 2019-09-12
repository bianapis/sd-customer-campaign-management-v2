package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRequestInputModel
 */
public class BQPerformanceAssessmentRequestInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String performanceAssessmentInstanceReference = null;

  private BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private Object performanceAssessmentRequestActionTaskRecord = null;

  private CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

