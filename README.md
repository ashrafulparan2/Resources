# Schema: add schema for `document.legal-claim`
## Schema Motivation
This schema aims to enhance the efficiency of legal processes by structuring the data extracted from legal claim forms. It ensures better organization, easier retrieval, and processing of legal claim information across different departments, including legal services, claims processing, and case management.

### Benefits:
- Standardizes claim data capture across different claim formats and channels

- Improves the tracking of legal claims, assignments, and resolutions

- Flexible structure to accommodate different claim types (e.g., personal injury, property damage, worker’s compensation)

- Detailed tracking of claim status, resource allocation, and supporting documentation

## Sample Documents:

- [Sample Legal Claim Form 1](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/Legal%20Claim/legal%20(1).pdf)

- [Sample Legal Claim Form 2](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/Legal%20Claim/legal%20(2).pdf)

- [Sample Legal Claim Form 3](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/Legal%20Claim/legal%20(3).pdf)

## Document Input:

- [Sample Legal Claim Form 3](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/Legal%20Claim/legal%20(3).pdf)

# Sample JSON Output

```json
{
  "court_name": "Cambridge County Court",
  "fee_account_number": "H6QJ7A1",
  "claimant": [
    {
      "name": "James Alexander Smith",
      "address": {
        "building_street": "14 Elmwood Avenue",
        "town_city": "Cambridge",
        "county_state": null,
        "postcode_zip": "CB4 3JT"
      },
      "phone": null,
      "email": null
    }
  ],
  "defendant": [
    {
      "name": "Sarah Elizabeth Johnson",
      "address": {
        "building_street": "Flat 2, Willow Court, 24 Highfield Road",
        "town_city": "Cambridge",
        "county_state": null,
        "postcode_zip": "CB1 9HG"
      },
      "phone": null,
      "email": null
    }
  ],
  "brief_details_of_claim": "Claim for breach of contract relating to home renovation work carried out inadequately, 
causing the claimant to incur additional costs for corrective work.",
  "claim_value": 5200.0,
  "financial_details": {
    "amount_claimed": 5200.0,
    "court_fee": 205.0,
    "legal_representative_costs": 450.0,
    "total_amount": 5855.0
  },
  "preferred_hearing_centre": "Cambridge County Court",
  "vulnerability_details": {
    "is_vulnerable": true,
    "details": "My witness has significant anxiety in formal environments. I kindly request a smaller courtroom or   
private waiting area to minimize distress.",
    "human_rights_issues": false
  },
  "particulars_of_claim": "The Claimant entered into a contract with the Defendant on 10 October 2024, whereby the   
Defendant agreed to carry out home renovation works at the Claimant's property located at 14 Elmwood Avenue,
Cambridge, CB4 3JT, for a total cost of £7,500.",
  "particulars_status": "attached",
  "signature_details": {
    "signatory_type": "claimant",
    "date": "24/12/2024",
    "full_name": "James Alexander Smith",
    "legal_firm": "Anderson & Lewis Solicitors LLP",
    "position": "Senior Associate Solicitor"
  },
  "contact_details": {
    "phone": "01223 456789",
    "dx_number": "DX 58010 Cambridge 1",
    "reference": "JAS/AL/2025",
    "human_rights_issues": false
  },
  "particulars_of_claim": "The Claimant entered into a contract with the Defendant on 10 October 2024, whereby the   
Defendant agreed to carry out home renovation works at the Claimant's property located at 14 Elmwood Avenue,
Cambridge, CB4 3JT, for a total cost of £7,500.",
  "particulars_status": "attached",
  "signature_details": {
    "signatory_type": "claimant",
    "date": "24/12/2024",
    "full_name": "James Alexander Smith",
    "legal_firm": "Anderson & Lewis Solicitors LLP",
    "position": "Senior Associate Solicitor"
  },
  "contact_details": {
    "phone": "01223 456789",
    "dx_number": "DX 58010 Cambridge 1",
    "reference": "JAS/AL/2025",
    "email": "info@andersonlewissolicitors.co.uk"
  }
```
