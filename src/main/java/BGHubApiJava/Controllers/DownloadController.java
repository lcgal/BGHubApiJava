package BGHubApiJava.Controllers;

import BGHubApiJava.Services.AzureBlobService;
import BGHubApiJava.Services.BlobService;
import org.springframework.web.bind.annotation.GetMapping;

import BGHubApiJava.Repositories.GameRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Blob;

@RestController
public class DownloadController {
	
	private GameRepository gameRepo;
	private BlobService blobService;
	
	public DownloadController(GameRepository gameRepo, BlobService blobService) {

		this.gameRepo = gameRepo;
		this.blobService = blobService;
	}
	
	@GetMapping("gamelist/{version}")
	 public String getGameList(@PathVariable String version) {
		blobService.downloadBlob("gamelists", "current.json");
		return "home2";
		}
}
