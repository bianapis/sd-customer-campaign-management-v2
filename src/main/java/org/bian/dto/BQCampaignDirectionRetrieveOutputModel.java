package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;
import org.bian.dto.BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis;
import org.bian.dto.BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveOutputModel
 */
public class BQCampaignDirectionRetrieveOutputModel   {
  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private String campaignDirectionRetrieveActionTaskReference = null;

  private Object campaignDirectionRetrieveActionTaskRecord = null;

  private String campaignDirectionRetrieveActionResponse = null;

  private BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport campaignDirectionInstanceReport = null;

  private BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis campaignDirectionInstanceAnalysis = null;


  /**
   * Get campaignDirectionInstanceRecord
   * @return campaignDirectionInstanceRecord
  **/

  public BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord getCampaignDirectionInstanceRecord() {
    return campaignDirectionInstanceRecord;
  }

  public void setCampaignDirectionInstanceRecord(BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord) {
    this.campaignDirectionInstanceRecord = campaignDirectionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Campaign Direction instance retrieve service call 
   * @return campaignDirectionRetrieveActionTaskReference
  **/

  public String getCampaignDirectionRetrieveActionTaskReference() {
    return campaignDirectionRetrieveActionTaskReference;
  }

  public void setCampaignDirectionRetrieveActionTaskReference(String campaignDirectionRetrieveActionTaskReference) {
    this.campaignDirectionRetrieveActionTaskReference = campaignDirectionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return campaignDirectionRetrieveActionTaskRecord
  **/

  public Object getCampaignDirectionRetrieveActionTaskRecord() {
    return campaignDirectionRetrieveActionTaskRecord;
  }

  public void setCampaignDirectionRetrieveActionTaskRecord(Object campaignDirectionRetrieveActionTaskRecord) {
    this.campaignDirectionRetrieveActionTaskRecord = campaignDirectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return campaignDirectionRetrieveActionResponse
  **/

  public String getCampaignDirectionRetrieveActionResponse() {
    return campaignDirectionRetrieveActionResponse;
  }

  public void setCampaignDirectionRetrieveActionResponse(String campaignDirectionRetrieveActionResponse) {
    this.campaignDirectionRetrieveActionResponse = campaignDirectionRetrieveActionResponse;
  }


  /**
   * Get campaignDirectionInstanceReport
   * @return campaignDirectionInstanceReport
  **/

  public BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport getCampaignDirectionInstanceReport() {
    return campaignDirectionInstanceReport;
  }

  public void setCampaignDirectionInstanceReport(BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport campaignDirectionInstanceReport) {
    this.campaignDirectionInstanceReport = campaignDirectionInstanceReport;
  }


  /**
   * Get campaignDirectionInstanceAnalysis
   * @return campaignDirectionInstanceAnalysis
  **/

  public BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis getCampaignDirectionInstanceAnalysis() {
    return campaignDirectionInstanceAnalysis;
  }

  public void setCampaignDirectionInstanceAnalysis(BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis campaignDirectionInstanceAnalysis) {
    this.campaignDirectionInstanceAnalysis = campaignDirectionInstanceAnalysis;
  }


}

