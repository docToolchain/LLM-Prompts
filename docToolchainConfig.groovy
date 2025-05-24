/*
 * docToolchain Configuration for LLM-Prompts
 * 
 * This configuration enables professional documentation generation using generateSite
 * for creating a modern, searchable documentation website with GitHub Pages deployment.
 */

// Output path for generated documents
outputPath = 'build/docs'

// Path where docToolchain will search for input files
inputPath = 'src/docs'

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
    'imagesdir': 'images',
    'site-title': 'LLM Prompts for Software Architecture',
    'site-description': 'A comprehensive collection of LLM prompts for software architecture documentation'
]

// Site generation configuration for generateSite
site = [
    // Site-specific configuration for better documentation website
    name: 'LLM Prompts for Software Architecture',
    description: 'A comprehensive collection of LLM prompts for software architecture documentation',
    baseUrl: 'https://doctoolchain.github.io/LLM-Prompts/',
    author: 'docToolchain Community',
    
    // Theme and styling
    theme: 'default'
]

// Microsite configuration (used by generateSite)
microsite = [
    // Enable microsite generation
    enabled: true,
    
    // Microsite-specific settings
    siteName: 'LLM Architecture Prompts',
    siteDescription: 'Professional LLM prompts for software architecture documentation',
    baseUrl: 'https://doctoolchain.github.io/LLM-Prompts/',
    
    // Output directory for microsite
    outputDir: 'build/microsite'
]

// GitHub Pages configuration
githubPages = [
    // Enable for GitHub Pages deployment
    enabled: true,
    branch: 'gh-pages',
    folder: 'build/microsite'
]

// PDF configuration
pdfTheme = 'basic'

// Task dependencies and settings
taskGroups = [
    'doctoolchain': [
        'generateSite',
        'generatePDF'
    ]
]

// PlantUML configuration for diagrams
plantuml = [
    format: 'svg'
]

// Kroki configuration for diagram generation
kroki = [
    serverUrl: 'https://kroki.io'
]