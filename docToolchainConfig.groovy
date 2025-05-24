/*
 * docToolchain Configuration
 * 
 * This configuration file is used to configure docToolchain for the LLM-Prompts project.
 * It defines the structure, output formats, and various settings for generating documentation.
 */

// Output path for generated documents
outputPath = 'build/docs'

// Path where docToolchain will search for input files
inputPath = 'src/docs'

// Main AsciiDoc file that includes all other files
mainConfigFile = 'docToolchainConfig.groovy'

// Files to process and output formats
inputFiles = [
    [file: 'index.adoc', formats: ['html','pdf']],
]

// Directories containing images
imageDirs = ["${inputPath}/images"]

// AsciiDoc attributes - these can be used in your documents
asciidoctorConfigFile = [
    'source-highlighter': 'highlight.js',
    'toc': 'left',
    'toclevels': '3',
    'sectnums': '',
    'icons': 'font',
    'imagesdir': 'images'
]

confluence = [
    // Confluence configuration (if needed later)
    // baseUrl: 'https://yourcompany.atlassian.net',
    // spaceKey: 'SPACE',
    // username: System.getenv('CONFLUENCE_USERNAME'),
    // password: System.getenv('CONFLUENCE_API_TOKEN')
]

// GitHub Pages configuration
githubPages = [
    // Enable for GitHub Pages deployment
    enabled: true,
    branch: 'gh-pages',
    folder: 'build/docs/html5'
]

// PDF configuration
pdfTheme = 'basic'

// Task dependencies and settings
taskGroups = [
    'doctoolchain': [
        'generateHTML',
        'generatePDF',
        'generateSite'
    ]
]

// Additional PlantUML configuration for diagrams
plantuml = [
    // PlantUML settings if needed
    format: 'svg'
]

// Kroki configuration for diagram generation
kroki = [
    // Use kroki.io service for diagram generation
    serverUrl: 'https://kroki.io'
]
