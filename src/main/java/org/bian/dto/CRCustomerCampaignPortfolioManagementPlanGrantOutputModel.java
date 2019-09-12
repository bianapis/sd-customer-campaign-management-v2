package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanGrantOutputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanGrantOutputModel   {
  private String customerCampaignPortfolioManagementPlanGrantActionTaskReference = null;

  private Object customerCampaignPortfolioManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCustomerCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Portfolio Management Plan instance grant service call 
   * @return customerCampaignPortfolioManagementPlanGrantActionTaskReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanGrantActionTaskReference() {
    return customerCampaignPortfolioManagementPlanGrantActionTaskReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanGrantActionTaskReference(String customerCampaignPortfolioManagementPlanGrantActionTaskReference) {
    this.customerCampaignPortfolioManagementPlanGrantActionTaskReference = customerCampaignPortfolioManagementPlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCustomerCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCustomerCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

