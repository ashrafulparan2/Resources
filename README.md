# Schema: add schema for `document.form-work-order`
## Schema Motivation
Enhanced schema for structured extraction of work order information from maintenance and service requests, supporting various types of work orders across different departments and service categories.

### Benefits:
- Standardizes work order data capture across different request channels and formats
- Comprehensive tracking of work requests, assignments, and resolution details
- Flexible structure to accommodate different work types (maintenance, IT, facilities, equipment repair)
- Detailed tracking of work status, resource allocation, and supporting documentation

## Sample Documents:

- [Sample Work Order Document 1](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/wor1.pdf)

- [Sample Work Order Document 2](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/wor2.pdf)

- [Sample Work Order Document 3](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/wor3.pdf)

## Document Input:

- [Sample Work Order Document 1](https://raw.githubusercontent.com/ashrafulparan2/resource/refs/heads/main/wor1.pdf)

# Sample JSON Output

```json
{
  "company_info": {
    "name": "Company Name",
    "address": "123 Company Address Drive",
    "suite": "Suite 412",
    "city": "Company City",
    "state": "NY",
    "zip_code": "11101",
    "phone": "321-654-9870",
    "email": "Email Address"
  },
  "order_number": "0012345",
  "order_type": "Automotive",
  "client_name": "Sarah Goodwin",
  "client_phone": "555-987-6543",
  "client_email": null,
  "service_location": "123 Company Address Drive, Suite 412, Company City, NY 11101",
  "order_date": "2024-11-09T09:00:00",
  "start_date": "2024-11-09T09:00:00",
  "end_date": null,
  "date_completed": null,
  "vehicle_info": {
    "vin": "1HGBH41JXMN109112",
    "make_model": "Toyota Camry 2018",
    "year": null,
    "odometer": 58000.0,
    "license_number": "ABC-1234",
    "state": "WA",
    "motor_number": "4G634HK"
  },
  "services_requested": [
    "Change Oil",
    "Transmission Service",
    "Differential Service",
    "Flat Tire Repair",
    "Battery Replacement / Check",
    "Brake Inspection / Replacement",
    "ADAS Calibration"
  ],
  "job_description": "Oil Change Service and Brake Inspection",
  "priority_level": null,
  "materials": [
    {
      "description": "Oil Change Service",
      "quantity": "3",
      "price_per_unit": "75",
      "amount": "225",
      "part_number": null
    },
    {
      "description": "Brake Inspection / Replacement",
      "quantity": "2",
      "price_per_unit": "75",
      "amount": "150",
      "part_number": null
    },
    {
      "description": "Part 1122",
      "quantity": "1",
      "price_per_unit": "25",
      "amount": "25",
      "part_number": "1122"
    },
    {
      "description": "Part 3145",
      "quantity": "1",
      "price_per_unit": "20",
      "amount": "20",
      "part_number": "3145"
    },
    {
      "description": "Part 4455",
      "quantity": "1",
      "price_per_unit": "90",
      "amount": "90",
      "part_number": "4455"
    },
    {
      "description": "Part 5566",
      "quantity": "2",
      "price_per_unit": "50",
      "amount": "100",
      "part_number": "5566"
    }
  ],
  "labor_items": [],
  "materials_total": "235",
  "labor_total": "375",
  "subtotal": "610",
  "tax_rate": "8",
  "tax_amount": "48.8",
  "total_amount": "658.8",
  "work_authorized_by": "Sarah Goodwin",
  "authorization_date": "2025-11-09T00:00:00",
  "work_completed_by": null,
  "work_approved_by": null
}
```
