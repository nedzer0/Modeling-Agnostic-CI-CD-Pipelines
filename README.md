## Overview

The **Modeling-Agnostic-CI-CD-Pipelines** project aims to simplify and speed up the configuration and migration of CI/CD pipelines across different DevOps platforms. The solution is built on a platform-independent generic metamodel, which serves as the foundation for developing platform-specific metamodels tailored to various DevOps platforms.

## Project Structure

The repository is organized into the following directories:

- **Code Generation**: Contains templates and scripts for generating executable CI/CD pipeline scripts
- **DSL2XMI**: Plugin to convert DSL files to XMI format
- **M2M**: Model-to-Model transformations
- **Metamodels**: Definition and configuration of the generic and platform-specific metamodels
- **Sirius Diagrams**: Sirius Visual diagrams for configuring CI/CD pipelines
- **XMI2DSL**: Plugin to convert XMI files to DSL format
- **Xtex Grammars**: Grammar definitions, custom validators and quickfixes
