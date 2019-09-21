#########################################################################
City      Country   Gender    AvgIncome(In USD Dollar)
delhi     India      M           1000
ggn       India      F           1500
chd       India      F            2000
new york             M            2000
london               F            3000


##########################################################################

Q1 calculate avgIncome city wise

Q1 Convert  


##########################################################################
Country/city    Gender          AvgIncome



##############################################



ss
SAPIENT CODING EXERCISE

Instructions

Duration of this exercise is 120 minutes. Please manage your time accordingly.

Make any necessary assumption, and clearly state the assumptions made.

Do not seek any help – online or through any other source.

Do not disclose this problem with anyone.

Expectations

The code should run and solve the requirement.

Write the Unit Test Cases using JUNIT/ TestNG (if you’re not conversant with JUNIT/TestNG , just list down unit test cases).

Please make sure you get soft copy of sample input & output files from hiring team

Evaluation criteria

Code Completeness/ Correctness

Code Structure and quality: Modularity, usage of OO principles, size of classes/functions, class/function/variable names, package/class structure

Choice of data structures

Unit Test cases

The better you perform on these criteria, higher you will score.

Problem Statement

Sapient has won a bid for ABC agency (will be referred as client going forward) which publishes the per capita income data for various cities / countries. Client receives the income information from various external sources. The per capita income information are received in a pre-configured format, for example, CSV, EXCEL, XML or a simple pipe delimited format text file placed at a file location.

Note: The code should handle csv format input, however the design should be extensible to support other input formats as well in future.

Client wants to -

Load the income data (as described in Sample_Input.csv) into the system.

Calculate the average income in USD (US Dollar), (currency conversion is required if needed).

The records should be grouped by Country and gender (refer Sample_Output.csv).

Note: City should be used where country is not available.

Currency Rates

USD (US Dollar)

Currency

1 $

66 INR

1 $

0.67 GBP

1 $

1.5 SGD

1 $

8 HKD

Objective

The objective of the system is:

To read the average income information into the system. The various attributes are listed below.

To calculate the average income grouped by country and gender.

To provide API to get the summary report in a particular format (format mentioned below) in a csv file.

Attributes (provided in the Input)

Attribute name

Attribute Description

City

City

Country

Country (Not Mandatory)

Gender

M / F

Currency

The base currency (e.g. INR for Indian rupee, SGD for Singapore dollar, HKD for Hong kong Dollar)

Amount

Average Income, in decimals.

Summary Report Definition

The summery report should print the average price grouped by country and gender in a csv file. Report should be SORTED further by Country, gender and average price.

Note: City should be used where country is not available.

Country / City Name

Gender

Average Income (USD)

Sample java command

java <Sample_Input.csv> <Sample_Output.csv>

Sample Data
   