# Contributing to LLM Architecture Prompts

🎉 Thank you for your interest in contributing to the LLM Architecture Prompts project! We welcome contributions from the community to make this resource even more valuable for software architects and development teams.

## 📋 Ways to Contribute

### 1. **New Prompts**
- Create prompts for specific domains (e.g., microservices, data architecture, cloud-native)
- Develop prompts for emerging methodologies
- Add prompts for specific tools integration

### 2. **Improve Existing Prompts**
- Enhance question clarity and effectiveness
- Add more comprehensive examples
- Improve output formatting

### 3. **Documentation**
- Add examples and use cases
- Improve installation and usage instructions
- Create video tutorials or walkthroughs

### 4. **Technical Improvements**
- Enhance the website design and usability
- Improve docToolchain integration
- Add automation and testing

## 🚀 Getting Started

### Prerequisites
- Git knowledge
- Basic understanding of AsciiDoc (for documentation)
- Familiarity with architecture documentation concepts
- Experience with LLMs (Claude, ChatGPT, etc.)

### Setup Development Environment

1. **Fork the repository**
   ```bash
   # Fork on GitHub, then clone your fork
   git clone https://github.com/YOUR_USERNAME/LLM-Prompts.git
   cd LLM-Prompts
   ```

2. **Install docToolchain** (for local development)
   ```bash
   ./dtcw local install doctoolchain
   ```

3. **Test the website generation**
   ```bash
   ./dtcw generateSite
   ```

4. **Create a new branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

## 📝 Prompt Development Guidelines

### Structure for New Prompts

Each prompt should follow this structure:

```markdown
# Prompt Name

## Purpose
Clear description of what this prompt achieves

## When to Use
Specific scenarios where this prompt is most effective

## Prerequisites
What information/context the user should have ready

## The Prompt
[The actual prompt text]

## Expected Output
Description of what the LLM should generate

## Example Usage
Concrete example with sample input and output

## Integration Notes
How this works with other prompts or tools
```

### Quality Standards

✅ **Do:**
- Test prompts with multiple LLMs (Claude, ChatGPT, etc.)
- Provide clear, specific instructions
- Include concrete examples
- Follow arc42 and docToolchain conventions
- Use consistent terminology
- Include validation criteria

❌ **Don't:**
- Create overly broad or vague prompts
- Assume specific LLM capabilities
- Forget to test the prompt thoroughly
- Include proprietary or sensitive information in examples

### File Naming Conventions

- Use descriptive, hyphenated names: `context-diagram-generator.md`
- For AsciiDoc versions: `90-Context-Diagram-Generator.adoc`
- Examples: `context-diagram-example.adoc`
- Descriptions: `Context-Diagram-Generator-Description.adoc`

## 🔍 Testing Your Contributions

### Prompt Testing Checklist

- [ ] Prompt works with Claude Sonnet/Opus
- [ ] Prompt works with ChatGPT 4
- [ ] Output follows specified format
- [ ] Example produces expected results
- [ ] Instructions are clear and unambiguous
- [ ] Integration with docToolchain works
- [ ] AsciiDoc syntax is valid

### Documentation Testing

```bash
# Generate the website locally
./dtcw generateSite

# Check for broken links
./dtcw htmlSanityCheck

# Validate AsciiDoc syntax
./dtcw generateHTML
```

## 📚 Content Guidelines

### Writing Style
- **Clear and Concise**: Use simple, direct language
- **Action-Oriented**: Start with verbs ("Create", "Generate", "Analyze")
- **Inclusive**: Use gender-neutral language
- **Professional**: Maintain professional tone while being approachable

### Code and Examples
- Use realistic, but anonymized examples
- Include diverse scenarios (startup, enterprise, different domains)
- Provide complete, working examples
- Comment complex parts

### Diagrams and Visuals
- Use PlantUML for diagrams when possible
- Include alt-text for accessibility
- Ensure diagrams are readable at different sizes
- Use consistent styling

## 🔄 Submission Process

### Pull Request Guidelines

1. **Create Descriptive PR Title**
   ```
   feat: Add microservices architecture prompt
   fix: Improve ADR template clarity
   docs: Add deployment examples
   ```

2. **PR Description Template**
   ```markdown
   ## Changes
   - Brief description of what changed
   
   ## Testing
   - How you tested the changes
   - Which LLMs you tested with
   
   ## Examples
   - Link to or include example outputs
   
   ## Related Issues
   - Fixes #123
   ```

3. **Review Process**
   - All PRs require at least one review
   - Maintainers will test prompts with different LLMs
   - Documentation changes must generate correctly
   - Examples must be complete and working

### Commit Message Format

```
type(scope): description

feat(prompts): add stakeholder analysis prompt
fix(navigation): correct broken links
docs(examples): add complete ADR example
style(website): improve mobile responsiveness
test(ci): add prompt validation tests
```

## 🏷️ Issue Guidelines

### Bug Reports
Use the bug report template and include:
- Which prompt/page has the issue
- Expected vs actual behavior
- Steps to reproduce
- Browser/environment details

### Feature Requests
Use the feature request template and include:
- Clear description of the proposed feature
- Use cases and benefits
- Acceptance criteria
- Mockups or examples (if applicable)

### Questions
- Check existing issues and documentation first
- Use clear, specific titles
- Provide context about your use case

## 🏆 Recognition

Contributors will be recognized in:
- CONTRIBUTORS.md file
- Release notes for significant contributions
- Special mentions for outstanding contributions

### Contribution Types
- **Code Contributors**: Prompt development, website improvements
- **Content Contributors**: Documentation, examples, tutorials  
- **Community Contributors**: Issue triaging, helping users
- **Design Contributors**: UI/UX improvements, graphics

## 📊 Metrics and Success

We track:
- Prompt usage and effectiveness
- Community feedback and adoption
- Documentation completeness
- Website analytics and user engagement

## 🤝 Community Standards

### Code of Conduct
We follow the [Contributor Covenant](https://www.contributor-covenant.org/):
- Be respectful and inclusive
- Welcome newcomers and help them learn
- Focus on constructive feedback
- Assume good intentions

### Communication Channels
- **GitHub Issues**: Bug reports, feature requests
- **GitHub Discussions**: General questions, ideas
- **Pull Requests**: Code review and discussion

## 📖 Resources

### Learning Materials
- [arc42 Documentation](https://arc42.org)
- [docToolchain Guide](https://doctoolchain.org)
- [AsciiDoc Syntax](https://asciidoc.org/)
- [PlantUML Documentation](https://plantuml.com/)

### Tools
- **AsciiDoc Editors**: VS Code with AsciiDoc extension
- **Diagram Tools**: PlantUML, draw.io
- **Testing**: Local docToolchain installation

## ❓ Getting Help

- **New to Contributing?** Check out [First Contributions](https://firstcontributions.github.io/)
- **Questions about Prompts?** Open a GitHub Discussion
- **Technical Issues?** Create a detailed GitHub Issue
- **General Questions?** Check the documentation first

## 🎯 Roadmap

Check our [project roadmap](https://github.com/docToolchain/LLM-Prompts/projects) for:
- Planned features and improvements
- Community priorities
- Release timeline

---

**Thank you for contributing to making architecture documentation better for everyone!** 🚀

_Last updated: June 2025_