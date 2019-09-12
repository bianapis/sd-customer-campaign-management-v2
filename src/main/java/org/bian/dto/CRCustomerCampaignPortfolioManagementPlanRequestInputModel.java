package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRequestInputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanRequestInputModel   {
  private String customerCampaignManagementServicingSessionReference = null;

  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;

  private Object customerCampaignPortfolioManagementPlanRequestActionTaskRecord = null;

  private CRCustomerCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignManagementServicingSessionReference
  **/

  public String getCustomerCampaignManagementServicingSessionReference() {
    return customerCampaignManagementServicingSessionReference;
  }

  public void setCustomerCampaignManagementServicingSessionReference(String customerCampaignManagementServicingSessionReference) {
    this.customerCampaignManagementServicingSessionReference = customerCampaignManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Portfolio Management Plan instance 
   * @return customerCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReference() {
    return customerCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReference(String customerCampaignPortfolioManagementPlanInstanceReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReference = customerCampaignPortfolioManagementPlanInstanceReference;
  }


  /**
   * Get customerCampaignPortfolio
   * @return customerCampaignPortfolio
  **/

  public CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignPortfolioManagementPlanRequestActionTaskRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanRequestActionTaskRecord() {
    return customerCampaignPortfolioManagementPlanRequestActionTaskRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanRequestActionTaskRecord(Object customerCampaignPortfolioManagementPlanRequestActionTaskRecord) {
    this.customerCampaignPortfolioManagementPlanRequestActionTaskRecord = customerCampaignPortfolioManagementPlanRequestActionTaskRecord;
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

