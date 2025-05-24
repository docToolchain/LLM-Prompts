# LLM Prompts for Software Architecture

A comprehensive collection of Large Language Model (LLM) prompts designed to assist software architects, developers, and technical writers in creating high-quality architecture documentation.

## 🎯 Purpose

This repository provides carefully crafted prompts for modern LLMs (like Claude, ChatGPT, or others) to generate structured, comprehensive documentation following established frameworks like arc42.

## 📋 Available Prompts

### Core Architecture Prompts
- **[Architecture Communication Canvas](Architecture-Communication-Canvas.md)** - Create comprehensive architecture overviews using Gernot Starke's canvas approach
- **[Architecture Decision Records](Architecture-Decision-Record.md)** - Generate structured ADRs with proper rationale and alternatives analysis
- **[arc42 Chapter Generator](arc42-Chapter-Generator.md)** - Step-by-step arc42 documentation creation

### Quality and Risk Management
- **[Quality Scenarios Builder](Quality-Scenarios-Builder.md)** - Create testable quality requirements and scenarios
- **[Risk Assessment Matrix](Risk-Assessment-Matrix.md)** - Systematic risk identification and mitigation planning
- **[Technical Debt Tracker](Technical-Debt-Tracker.md)** - Comprehensive technical debt management

## 🚀 Quick Start

### Using with docToolchain

This repository is set up with docToolchain for professional documentation generation:

```bash
# Make wrapper executable
chmod +x dtcw

# Generate HTML documentation
./dtcw generateHTML

# Generate PDF documentation
./dtcw generatePDF

# View generated docs
open build/docs/html5/index.html
```

### Using Individual Prompts

1. Choose the appropriate prompt from the collection
2. Copy the prompt text to your LLM interface
3. Provide your project context when asked
4. Follow the structured conversation flow
5. Review and refine the generated documentation

## 📖 Documentation

The complete documentation is available in multiple formats:

- **HTML**: Browse the full documentation with navigation
- **PDF**: Printable version for offline use
- **GitHub Pages**: Online version at `https://raifdmueller.github.io/LLM-Prompts/`

## 🛠 How These Prompts Work

### Design Principles

1. **Structured Conversations**: Each prompt guides the LLM through a logical sequence of questions
2. **Framework Alignment**: Based on established architecture frameworks (arc42, ADRs, etc.)
3. **Interactive Approach**: Designed for back-and-forth conversation, not one-shot generation
4. **Quality Focus**: Emphasizes quality attributes, scenarios, and testable requirements
5. **Professional Output**: Generates documentation suitable for enterprise use

### Best Practices

- **Provide Context**: Always give the LLM sufficient background about your project
- **Iterate and Refine**: Use the interactive nature of these prompts to improve results
- **Validate Results**: Review generated content with your team and stakeholders
- **Customize**: Adapt prompts to your specific needs and organizational standards

## 🏗 Integration with Tools

These prompts work excellently with:

- **docToolchain**: For generating professional documentation
- **Confluence**: For collaborative documentation platforms
- **Git repositories**: For docs-as-code approaches
- **Mermaid/PlantUML**: For diagram generation
- **AsciiDoc/Markdown**: For structured text formats

## 🤝 Contributing

We welcome contributions! Please see our contributing guidelines:

### Types of Contributions
- Improvements to existing prompts
- New prompts for architecture documentation
- Better examples and use cases
- Bug fixes and clarifications
- Documentation improvements

### How to Contribute
1. Fork this repository
2. Create a feature branch
3. Make your changes
4. Test with docToolchain if applicable
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **arc42**: For the excellent architecture documentation template
- **Gernot Starke**: For the Architecture Communication Canvas
- **docToolchain community**: For the fantastic documentation toolchain
- **ADR community**: For Architecture Decision Record standards

## 📞 Support

If you have questions or need support:

1. Check the [documentation](https://raifdmueller.github.io/LLM-Prompts/)
2. Search existing [issues](https://github.com/docToolchain/LLM-Prompts/issues)
3. Create a new issue if needed

---

**Happy Architecting! 🏛️**