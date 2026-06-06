import pypdf

def read_pdf(file_path):
    file = pypdf.PdfReader(file_path)
    for page in file.pages:
        print(page.extract_text(extraction_mode="layout"))