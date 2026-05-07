## Test Documentation

Test report was created manually in Google Docs and exported as PDF.

### Test cases structure
Each test case contains:
- Name
- Description
- Test data
- Steps
- Expected result
- Actual result
- Pass / Fail

### Bug reports structure
Each bug report contains:
- Title
- Severity
- Priority
- Connect (linked test case)
- Environment
- Steps to reproduce
- Expected result
- Actual result
- Photo documentation

## Testing Approach

1. **Read the task** — studied the Command Completion feature description 
   and official JetBrains documentation to understand expected behavior

2. **Explored the feature** — opened IntelliJ IDEA, created a Java file 
   and manually tried Command Completion in different contexts to get 
   familiar with how it works before writing test cases

3. **Defined testing scope** — identified which areas to cover based on 
   the task description: basic invocation, surround actions, postfix 
   templates, AI actions, refactoring commands

4. **Wrote test cases** — documented each scenario with test data, 
   steps, expected and actual results

5. **Executed tests** — ran each test case manually, compared actual 
   behavior with expected

6. **Logged bugs** — for every failed test case created a bug report 
   with reproduction steps, severity and priority

7. **Identified additional bugs** — during exploratory testing found 
   issues not covered by main test cases and documented them separately

8. **Summarized results** — compiled testing summary and outlined 
   areas for deeper testing in future

   ## Out of Scope / Further Testing Areas
The following areas were identified but not covered in this session:

- Kotlin support
- Undo/Redo after commands
- Invocation inside comments and String literals
- All postfix templates (.null, .notnull, .not, .return, .throw, .cast)
- AI actions — Generate documentation and Make code changes
- Command Completion in .properties files
- Keyboard navigation inside dropdown
- Performance on large files (1000+ lines)
