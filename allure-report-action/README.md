# Allure Report with history action

Generates Allure Report with history

## Inputs

### `results-dir`

**Required** The relative path to the Allure results directory. 

Default `allure-results`.

### `report-dir`

**Required** The relative path to the directory where Allure will write the generated report. 

Default `allure-results`.

## Example usage

```yaml
- name: Test local action
  uses: ./allure-report-action
  id: allure-report
  with:
    allure-results: allure-results
    allure-report: allure-report
```