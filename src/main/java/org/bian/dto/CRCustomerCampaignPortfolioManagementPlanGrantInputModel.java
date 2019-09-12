package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanGrantInputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanGrantInputModel   {
  private String customerCampaignManagementServicingSessionReference = null;

  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private Object customerCampaignPortfolioManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCustomerCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerCampaignPortfolioManagementPlanGrantActionTaskRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanGrantActionTaskRecord() {
    return customerCampaignPortfolioManagementPlanGrantActionTaskRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanGrantActionTaskRecord(Object customerCampaignPortfolioManagementPlanGrantActionTaskRecord) {
    this.customerCampaignPortfolioManagementPlanGrantActionTaskRecord = customerCampaignPortfolioManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCustomerCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCustomerCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

