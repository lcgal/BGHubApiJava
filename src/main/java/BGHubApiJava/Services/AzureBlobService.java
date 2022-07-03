package BGHubApiJava.Services;

import com.azure.core.util.BinaryData;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AzureBlobService implements BlobService {

    private final BlobServiceClient blobClient;

    public void downloadBlob(String containerName, String blobName) {
        BlobContainerClient containerClient = blobClient.getBlobContainerClient(containerName);

        BlobClient blobClient = containerClient.getBlobClient(blobName);

        BinaryData content = blobClient.downloadContent();
    }
}